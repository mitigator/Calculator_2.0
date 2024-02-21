package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {

            val context = LocalContext.current
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Created by Shubham-2347256", color = Color.White

                    )
                }
                Column(
                    modifier = Modifier
                        .height(200.dp)
                        .width(400.dp)
                ) {
                    Button(
                        onClick = {
                            val navigate = Intent(this@MainActivity, BMI::class.java)
                            startActivity(navigate)
                            Toast.makeText(context,"Going to BMI Calculator",Toast.LENGTH_SHORT)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Text(text = "BMI Calculator", fontSize = 16.sp)
                    }

                    Button(
                        onClick = {
                            val navigate = Intent(this@MainActivity, Calculator::class.java)
                            startActivity(navigate)
                            Toast.makeText(context,"Going to Simple Calculator",Toast.LENGTH_SHORT)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Text(text = "Simple Calculator", fontSize = 16.sp)
                    }
                }
            }

        }

        Log.d("Activity_Lifecycle","onCreate invoked");
        Toast.makeText(this,"Created",Toast.LENGTH_SHORT).show();

    }
    override fun onStart() {
        super.onStart();
        Log.d("Activity_Lifecycle","onStart invoked");
        Toast.makeText(this,"Start",Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity_Lifecycle", "onResume invoked")
        Toast.makeText(this@MainActivity, "Resume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Log.d("Activity_Lifecycle", "onPause invoked")
        Toast.makeText(this@MainActivity, "Pause", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.d("Activity_Lifecycle", "onStop invoked")
        Toast.makeText(this@MainActivity, "Stop", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Activity_Lifecycle", "onRestart invoked")
        Toast.makeText(this@MainActivity, "Restart", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_Lifecycle", "onDestroy invoked")
        Toast.makeText(this@MainActivity, "Destroy", Toast.LENGTH_SHORT).show()
    }


}

