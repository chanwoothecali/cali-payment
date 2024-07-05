package com.example.payment.payment.application.port.out

import com.example.payment.payment.domain.Product
import reactor.core.publisher.Flux

interface LoadProductPort {

    fun getProduct(cardId: Long, productIds: List<Long>): Flux<Product>
}