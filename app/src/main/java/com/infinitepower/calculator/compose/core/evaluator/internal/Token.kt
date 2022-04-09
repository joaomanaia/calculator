package com.infinitepower.calculator.compose.core.evaluator.internal

internal class Token(
    val type: TokenType,
    val lexeme: String,
    val literal: Any?,
) {
    override fun toString() = "$type $lexeme $literal"
}