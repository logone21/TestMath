package com.example.test


import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
     var math:Math?=null

    @Before
    fun setup(){
        math = Math()
    }
    @Test
    fun simpleAddTest(){
        assertEquals("4",math?.add("2","2"))
    }
    @Test
    fun addEmptyTest(){
        assertEquals("Поле не заполнено",math?.add("2",""))
    }
    @Test
    fun addDoubleTest(){
        assertEquals("4.0",math?.add("2.0","2.0"))
    }
    @Test
    fun symbolAddTest(){
        assertEquals("Символы вводить нельзя",math?.add("&","2"))
    }
    @Test
    fun letterAddTest(){
        assertEquals("Буквы вводить нельзя",math?.add("ф","2"))
    }
   @Test
   fun intDoubleAddTest(){
       assertEquals("4.0",math?.add("2","2.0"))
   }
    @Test
    fun addNegativeTest(){
        assertEquals("Символы и буквы вводить нельзя",math?.add("-2","2"))
    }

    @Test
    fun divideTest(){
        assertEquals("3",math?.divide("9","3"))
    }
    @Test
    fun divideZeroTest(){
        assertEquals("На 0 делить нельзя",math?.divide("9","0"))
    }

    @After
    fun detach(){
        math = Math()
    }

}