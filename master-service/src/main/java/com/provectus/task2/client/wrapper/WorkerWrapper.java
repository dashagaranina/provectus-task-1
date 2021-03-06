package com.provectus.task2.client.wrapper;

import com.provectus.task2.client.WorkerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class WorkerWrapper {

    private final WorkerClient worker;

    public CompletableFuture<BigDecimal> wrap (Integer left, Integer right){
        return CompletableFuture.supplyAsync(()-> worker.calculate(left, right));
    }
}
