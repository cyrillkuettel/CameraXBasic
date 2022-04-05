package com.android.example.cameraxbasic.qrcode


interface QRCodeFoundListener {

        fun onQRCodeFound(qrCode: String?)
        fun qrCodeNotFound()
    }
