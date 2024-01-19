
package com.trc.massage.binding;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class Massage {

    private String code;
    private String name;
    private String status;
    private Price price;
    private Duration duration;
    private List<CancellationPolicy> cancellationPolicies;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public List<CancellationPolicy> getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(List<CancellationPolicy> cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public String formatPolicies(LocalDate date) {
        var sort = getCancellationPolicies().stream()
                .filter(p -> p.getPrice().getAmount() > 0)
                .sorted(Comparator.comparing(CancellationPolicy::getDate)).toList();
        List<String> stringPolicies = new ArrayList<>();
        List<CancellationDateRange> policies = new ArrayList<>();
        if (sort.get(0).getDate().isAfter(LocalDate.now())) {
            policies.add(new CancellationDateRange(null, sort.get(0).getDate().minusDays(1), new Price(0.0d, sort.get(0).getPrice().getCurrency())));
        }
        for (var i = 0; i < sort.size(); i++) {
            var p = sort.get(i);
            policies.add(new CancellationDateRange(p.getDate(), i + 1 < sort.size() ? sort.get(i + 1).getDate().minusDays(1) : date.minusDays(1), p.getPrice()));
        }
        if (sort.get(sort.size() - 1).getDate().isAfter(date)) {
            policies.add(new CancellationDateRange(date.minusDays(1), null, new Price(0.0d, sort.get(0).getPrice().getCurrency())));
        }

        for (var p : policies) {
            if (p.getStartDate() == null) {
                stringPolicies.add("Sin gastos de cancelación hasta el %s".formatted(p.getEndDate()));
            } else {

            }
        }
    }
}
