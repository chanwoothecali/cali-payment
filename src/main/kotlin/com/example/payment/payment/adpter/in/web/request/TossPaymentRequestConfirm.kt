package com.example.payment.payment.adpter.`in`.web.request

data class TossPaymentRequestConfirm(
    val paymentKey: String,
    val orderId: String,
    val amount: String
)