package com.example.payment.payment.adpter.out.web.product.client

import com.example.payment.payment.domain.Product
import reactor.core.publisher.Flux

interface ProductClient {

    fun getProducts(cartId: Long, productIds: List<Long>): Flux<Product>
}