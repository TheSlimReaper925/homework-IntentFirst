package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotoSecondeBtn.setOnClickListener {

            val name = inputName.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)

            finish()

        }

    }

}