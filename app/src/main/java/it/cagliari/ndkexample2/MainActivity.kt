package it.cagliari.ndkexample2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import it.cagliari.ndkexample2.ui.theme.NDKExample2Theme

class MainActivity : ComponentActivity() {

    private val utils1 = Utils()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            NDKExample2Theme {
                val key = remember { mutableStateOf(utils1.key) }

                Surface(
                    modifier = Modifier
                        .wrapContentSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {

                    Column {
                        Greeting(name = key.value)
                        Greeting(name = if (key.value == "123") "Kodingiz to'g'ri" else "Kodingiz xato")
                        Button(onClick = {
                            utils1.neverShareKey()
                            key.value = utils1.key
                        }) {

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = name,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NDKExample2Theme {
        Greeting("Android")
    }
}