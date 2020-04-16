package com.kodilla.good.patterns.challenges;

public interface InformationService {

    void inform(OrderRequest orderRequest);

    void informIfNotOrdered(OrderRequest orderRequest);
}
