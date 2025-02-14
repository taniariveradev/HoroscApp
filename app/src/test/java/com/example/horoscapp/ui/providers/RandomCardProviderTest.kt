package com.example.horoscapp.ui.providers

import org.junit.Assert.assertNotNull
import org.junit.Test

class RandomCardProviderTest {

    @Test
    fun `getRandomCard should return a random card`() {

        //Given
        val randomCard = RandomCardProvider()

        //When
        val card = randomCard.getLucky()

        //Then
        assertNotNull(card)
    }
}