package fastcampus.aop.part1.chapter2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fastcampus.aop.part1.chapter2.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cmValue = intent.getIntExtra("cmValue", 0)
        binding.textView.text = (cmValue / 100f).toString()
    }
}
