package application.com.maytinh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import application.com.maytinh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        addEvent()
    }

    private fun addEvent() {
        binding.btnCong.setOnClickListener {
            val a = binding.edtA.text.toString().toIntOrNull() ?: 0
            val b = binding.edtB.text.toString().toIntOrNull() ?: 0
            binding.txtKq.text = (a + b).toString()
        }

        binding.btnTru.setOnClickListener {
            val a = binding.edtA.text.toString().toIntOrNull() ?: 0
            val b = binding.edtB.text.toString().toIntOrNull() ?: 0
            binding.txtKq.text = (a - b).toString()
        }

        binding.btnNhan.setOnClickListener {
            val a = binding.edtA.text.toString().toIntOrNull() ?: 0
            val b = binding.edtB.text.toString().toIntOrNull() ?: 0
            binding.txtKq.text = (a * b).toString()
        }

        binding.btnChia.setOnClickListener {
            val a = binding.edtA.text.toString().toDoubleOrNull() ?: 0.0
            val b = binding.edtB.text.toString().toDoubleOrNull() ?: 1.0
            if (b == 0.0) {
                binding.txtKq.text = "Không thể chia cho 0"
            } else {
                binding.txtKq.text = (a / b).toString()
            }
        }
        binding.btnReset.setOnClickListener {
            binding.edtA.text.clear()
            binding.edtB.text.clear()
            binding.txtKq.text = "Kết Quả"

        }
    }

}