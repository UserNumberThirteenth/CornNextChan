package gemi.mission.cornnextchan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun main() {
            val name = "Gemini500"
            val age = 29
            println("Hello, I'm $name. I'm $age, very glad to meet you all")
        }
    }
}