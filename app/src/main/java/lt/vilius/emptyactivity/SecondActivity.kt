package lt.vilius.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val secondActivityButton: Button = findViewById(R.id.buttonOpenSecond)
        val secondActivityTextView: TextView = findViewById(R.id.textViewSecond)
        secondActivityButton.visibility = View.VISIBLE

        secondActivityTextView.visibility = View.VISIBLE

        val message = intent.getStringExtra("message_key")
        secondActivityTextView.setText("zinute:\n $message")

        secondActivityButton.setOnClickListener {
            finish()
        }
    }
}