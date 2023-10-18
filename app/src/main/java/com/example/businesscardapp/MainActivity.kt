package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp (){
    Surface(color = Color.White) {
        Column (
            modifier = Modifier
                //fillMaxWidth()
                //fillMaxHeight()
                .fillMaxSize()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ){
               val image = painterResource(R.drawable.profile)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(260.dp)
                )
                Text(
                    text = stringResource(R.string.FullName),
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontSize = 27.sp
                )
                Text(
                    text = stringResource(R.string.Title),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Column (
                modifier = Modifier
                    .padding(top =100.dp),
                //verticalArrangement = Arrangement.Center,
                //horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row {
                    val PhoneIcon = painterResource(id = R.drawable.phone)
                    Icon(
                        painter = PhoneIcon,
                        contentDescription = "Phone",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Telp),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val LinkIcon = painterResource(id = R.drawable.instagram)
                    Icon(
                        painter = LinkIcon ,
                        contentDescription = "Social Media",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Link),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp,bottom= 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row{
                    val EmailIcon = painterResource(id = R.drawable.baseline_email_24)
                    Icon(
                        painter = EmailIcon,
                        contentDescription = "Email",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(id = R.string.Email),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}