package com.example.basiclayoutkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    val bgImage = painterResource(id = R.drawable.background)
    val logoUmy = painterResource(id = R.drawable.logo_umy)
    val profile = painterResource(id = R.drawable.profile)

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        // Gambar latar belakang
        Image(
            painter = bgImage,
            contentDescription = "Background Login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Tata letak utama, Column
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, start = 20.dp, end = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Judul "Login
            Text(
                text = "Login",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Spacer(modifier = Modifier.height(4.dp))

            // Subtitle
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            //Logo UMY
            Image(
                painter = logoUmy,
                contentDescription = "Logo UMY",
                modifier = Modifier.size(140.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(30.dp))

            //Label "Nama"
            Text(
                text = "Nama",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Spacer(modifier = Modifier.height(2.dp))

            //Nama
            Text(
                text = "Fasya Tri Nugroho",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}