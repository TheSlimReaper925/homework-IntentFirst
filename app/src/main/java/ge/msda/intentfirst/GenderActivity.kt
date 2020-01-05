package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)

        var selected = ""

        val genders = arrayOf("Male", "Female", "Other")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genders)

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        genderSpn.adapter = adapter

        genderSpn.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // do nothing
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected = "${parent?.getItemAtPosition(position).toString()}"
            }


        }

        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")

        finishBtn.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("GENDER", selected)
            startActivity(intent)

            finish()
        }
    }
}