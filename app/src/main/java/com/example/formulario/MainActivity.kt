package com.example.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formulario.ui.theme.FormularioTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormularioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    app()
                }
            }
        }
    }
}

@Composable
fun app(){
    var nome by remember { mutableStateOf("ex: Lucas Silva das Oliveiras") }
    var telefone by remember { mutableStateOf("ex: (xx) xxxx-xxxx") }
    var celular by remember { mutableStateOf("ex: 9xxxx-xxxx") }
    var cidade by remember { mutableStateOf("ex: São Paulo") }
    var estado by remember { mutableStateOf("ex: SP") }
    var email by remember { mutableStateOf("ex: seunome@gmail.com") }

    Column(
        Modifier
            .background(Color.Gray)
            .fillMaxWidth()
    ) {

        Row(
            Modifier
                .background(Color.DarkGray)
                .padding(10.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App Formulário",
                fontFamily = FontFamily.Serif,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = { Text(text = "Nome: ", fontFamily = FontFamily.Serif)}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = { Text(text = "Telefone: ", fontFamily = FontFamily.Serif)}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = celular,
                onValueChange = {celular = it},
                label = { Text(text = "Celular: ", fontFamily = FontFamily.Serif)}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cidade,
                onValueChange = {cidade = it},
                label = { Text(text = "Cidade: ", fontFamily = FontFamily.Serif)}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = estado,
                onValueChange = {estado = it},
                label = { Text(text = "Estado: ", fontFamily = FontFamily.Serif)}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = email,
                onValueChange = {email = it},
                label = { Text(text = "Email de contato: ", fontFamily = FontFamily.Serif)}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
            ) {
                Text(text = "Cadastrar" , fontFamily = FontFamily.Serif)
            }
        }
    }
}

@Preview
@Composable
fun appPreview(){
    FormularioTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            app()
        }
    }
}