package fastcampus.aop.part1.chapter2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fastcampus.aop.part1.chapter2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener {
            val number = binding.editText.text.toString().toIntOrNull() ?: 0

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("cmValue", number)
            startActivity(intent)
        }
    }
}