package com.example.payment.payment.adpter.out.web.product

import com.example.payment.common.WebAdapter
import com.example.payment.payment.application.port.out.LoadProductPort
import com.example.payment.payment.domain.Product
import reactor.core.publisher.Flux

@WebAdapter
class ProductWebAdapter : LoadProductPort {

    override fun getProduct(cardId: Long, productIds: List<Long>): Flux<Product> {
        TODO("Not yet implemented")
    }
}