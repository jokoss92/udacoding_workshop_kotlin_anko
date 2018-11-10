package id.ac.mercubuana.jokosarjonos.birthdaycard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO : sembunyikan tvAgeResult
        tvAgeResult.visibility = View.INVISIBLE

        //TODO : event klik button
        btnFindMyAge.setOnClickListener {

            //TODO : mendapatkan tahun ini
            val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)

            //TODO : hitung (tahun sekarang - tahun lahir)
            val useAge = tahunSekarang - etBirthdayYear.text.toString().toInt()

            //TODO : set hasil ke textview
            tvAgeResult.text = "Your Age is : $useAge"

            //TODO tampilkan hasil pada textview
            tvAgeResult.visibility = View.VISIBLE
        }
    }


}
