package id.ac.mercubuana.jokosarjonos.birthdaycard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.util.*

class TestAnko : AppCompatActivity() {
    var tvHasil: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO : menggunakan Anko Layout
        linearLayout {
            orientation = LinearLayout.VERTICAL
            val etBirthYear = editText {
                hint = "Enter Your Birth Year"
            }

            button {
                text = "Find My Age"
                onClick {
                    //mendapatkan tahun saat ini
                    val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)
                    val tahunLahir = etBirthYear.text.toString()
                    var userAge = 0
                    if (tahunLahir.toIntOrNull()!=null){
                        userAge = tahunSekarang - tahunLahir.toInt()
                    } else {

                    }

//                    //TODO : Hitung tahun sekarang - tahun lahir
//                    val userAge = tahunSekarang - etBirthYear.text.toString().toInt()

                    //TODO set umur ke tvAgeResult
                    tvHasil?.text = "Your Age is : $userAge years old"



                }
            }

            tvHasil = textView {
                verticalPadding = dip(value = 20)
                text = "Your age is 0 years old"
            }
        }


    }
}