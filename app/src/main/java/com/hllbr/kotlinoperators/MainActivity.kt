package com.hllbr.kotlinoperators

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Operatorler

        var m = 5
        println(m)
        m = m+1
        println(m)
        m ++
        println(m)
        m--
        println(m)
        ++m
        println(m)
        --m
        m = m-1
        println(m)

        var n = 7
        println(n>m)
        println(m>n)

        //Veya = || == tüm koşullar birbirlerine veya bağlacı ile bağlanmışsa sadece bir kouşulun sağlanması sonucun True(1) olması için yeterlidir.
        //Ve && == tüm koşullar ve bağlacı ile bağlanmışsa sadece bir koşulun sonucunun false olması (şartın yerine getirilmemesi) işlemin -1 değer alması için yeterlidir.

        println(n>m && 1>2)
        println(n>m || 1>2)

        //Remaninder == kalan(mod alma olarakta bilinir)
        println(10%2)
    }
}