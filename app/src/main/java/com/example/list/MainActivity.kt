package com.example.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.list.ui.theme.ListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreen()
        }
    }
}


@Composable
@Preview(showBackground = true)
fun MyScreen(){
    val myItemsLsit = listOf<String>("Lunch", "Dessert", "Mains")
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize().padding(0.dp, 12.dp, 0.dp, 0.dp)
    ) {
        myItemsLsit.forEach(){
            MyListItem(text = it)
        }
    }

}


@Composable
//@Preview(showBackground = true)
fun MyListItem(text:String?){
    Button(
        onClick = { },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFFEBE3D5)),
        elevation = ButtonDefaults.buttonElevation(8.dp)

    ) {
        Text(
            text = text?:"Item",
            color = Color(0xFF495E57)
        )

    }
}