package com.example.yadihe_lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.yadihe_lifecycle.ui.theme.YadiHeLifecycleTheme

class MainActivity : ComponentActivity() {
    private val	TAG	=	"MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById<Button>(R.id.button)
        val textView:TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)
        button.setOnClickListener {
            textView.text = "Hello"
            editText.setText("Hello")
        }
        Log.d(TAG,"onCreate called.")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart called.")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart called.")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume called.")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop called.")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy called.")
    }
}

