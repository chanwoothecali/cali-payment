package com.example.payment.payment.adpter.`in`.web.api

data class TossPaymentRequestConfirm(
    val paymentKey: String,
    val orderId: String,
    val amount: String
)