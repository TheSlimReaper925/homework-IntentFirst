package ge.msda.intentfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")
        val gender = intent.extras?.getString("GENDER", "")

        showName.text = name
        showEmail.text = email
        showGender.text = gender


    }
}
