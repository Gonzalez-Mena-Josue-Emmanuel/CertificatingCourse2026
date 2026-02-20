package com.example.certificatingcourse2026

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificatingcourse2026.ui.theme.CertificatingCourse2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CertificatingCourse2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        name = "Josue Emmanuel González Mena",
                        number = 48,
                        course = "Starter 1",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(name: String, number: Int, course: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .padding(25.dp),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(
                id = R.drawable.android
            ),
            contentDescription = null,
            alpha = 0.3F,
            modifier = modifier
                .fillMaxWidth()
        )
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(25.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier.fillMaxWidth()
            )
            {
                Image(
                    painter = painterResource(
                        id = R.drawable.escudo_unam_fi
                    ),
                    contentDescription = null,
                    modifier = modifier.size(50.dp, 50.dp)
                )

                Text(
                    text = "Hihguard Corp",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )

                Image(
                    painter = painterResource(
                        id = R.drawable.escudo_unam
                    ),
                    contentDescription = null,
                    modifier = modifier.size(50.dp, 50.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier.fillMaxWidth()
            )
            {
                Text(
                    text = "This certificate is presented to:",
                    fontSize = 15.sp,
                    modifier = modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier.fillMaxWidth()
            )
            {
                Text(
                    text = name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "has completed a $number hours course on",
                fontSize = 15.sp,
                modifier = modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = course,
                fontSize = 19.sp,
                modifier = modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier.fillMaxWidth()
            )
            {
                Column() {
                    Image(
                        painter = painterResource(
                            id = R.drawable.firma_1
                        ),
                        contentDescription = null,
                        modifier = modifier.size(70.dp)
                    )

                    Text(
                        text = "Mónica López",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Directora Hihguard",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        fontStyle = FontStyle.Italic
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Column() {
                    Image(
                        painter = painterResource(
                            id = R.drawable.firma_2
                        ),
                        contentDescription = null,
                        modifier = modifier.size(70.dp)
                    )

                    Text(
                        text = "Carlos Sánchez",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Fundador Hihguard",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CertificatingCourse2026Theme {
        CertificatingCourse("Josue Emmanuel González Mena",48,"Starter 1")
    }
}