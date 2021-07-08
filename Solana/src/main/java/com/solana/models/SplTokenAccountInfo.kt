package com.solana.models

import com.solana.models.buffer.BufferInfo
import com.squareup.moshi.Json

const val MINIMUM_BALANCE_FOR_RENT_EXEMPTION_165 = 2039280L
const val REQUIRED_ACCOUNT_SPACE = 165L
class SplTokenAccountInfo(@Json(name = "value") override val value: BufferInfo<TokenResultObjects.Data>) : RPC<BufferInfo<TokenResultObjects.Data>>(null, value)