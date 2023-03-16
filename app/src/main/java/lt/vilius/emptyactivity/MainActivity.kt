package lt.vilius.emptyactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")

    final val TAG = "verygood_TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView: TextView = findViewById(R.id.myTextView)
        val openButton: Button = findViewById(R.id.buttonOpen)
        Log.i(TAG, "onCreate:  ${myTextView.text} : ")
        //myTextView.visibility
        openButton.visibility = View.VISIBLE


       //
        Log.i(TAG, "onCreate: ${getString((R.string.say_hello) )} : " + R.string.say_hello)

        lifecycleScope.launch{
            myTextView.setText(R.string.say_hello)

            delay(5000)

            myTextView.setText("Antra_Zinute")
        }
        openButton.setOnClickListener {
            //Log.i(TAG, "onCreate: just clicked OPEN button")
            val openIntent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(openIntent)
        }
    }
}