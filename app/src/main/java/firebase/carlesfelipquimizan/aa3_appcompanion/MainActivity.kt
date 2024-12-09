package firebase.carlesfelipquimizan.aa3_appcompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import firebase.carlesfelipquimizan.aa3_appcompanion.ui.theme.AA3_AppCompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AA3_AppCompanionTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                var emailField = findViewById(R.id.input_email)
                var passwordField = findViewById(R.id.input_password)
                findViewById<Button>(R.Id.register_button).setOnClickListener{Register}
            }
        }
    }
}


