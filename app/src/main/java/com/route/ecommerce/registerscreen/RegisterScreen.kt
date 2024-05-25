package com.route.ecommerce.registerscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.route.ecommerce.R
import com.route.ecommerce.ui.theme.RouteBlue
import com.route.ecommerce.ui.theme.fontFamily

@Composable
fun RegisterScreen() {

    var userFullName by remember { mutableStateOf("") }

    var mobileNumber by remember { mutableStateOf("") }

    var email by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }



    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(RouteBlue)
            .padding(20.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.routesignature),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(.6f)
                .fillMaxHeight(.2f)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(vertical = 20.dp),
            contentScale = ContentScale.Fit
        )

        Text(
            text = stringResource(R.string.full_name),
            color = Color.White,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        TextField(
            value = userFullName,
            onValueChange = { userFullName = it },
            singleLine = true,
            placeholder = { Text(stringResource(R.string.Enter_your_full_name)) },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            textStyle = TextStyle(fontFamily = fontFamily)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = stringResource(R.string.mobile_number),
            color = Color.White,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        TextField(
            value = mobileNumber,
            onValueChange = { mobileNumber = it },
            singleLine = true,
            placeholder = { Text(stringResource(R.string.Enter_your_mobile_no)) },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            textStyle = TextStyle(fontFamily = fontFamily)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = stringResource(R.string.e_mail_address),
            color = Color.White,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            placeholder = { Text(stringResource(R.string.Enter_your_email_address)) },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            textStyle = TextStyle(fontFamily = fontFamily)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = stringResource(R.string.password),
            color = Color.White,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            placeholder = { Text(stringResource(R.string.enter_your_password)) },
            visualTransformation = if (passwordVisible)
                VisualTransformation.None
            else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            textStyle = TextStyle(fontFamily = fontFamily),
            trailingIcon = {
                val image = if (passwordVisible)
                    painterResource(id = R.drawable.eye_visible)
                else painterResource(id = R.drawable.eye_not_visible)
                val description = if (passwordVisible) "Hide password" else "Show password"
                IconButton(
                    colors = IconButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Gray,
                        disabledContainerColor = Color.Transparent,
                        disabledContentColor = Color.White
                    ) ,
                    onClick = {passwordVisible = !passwordVisible}
                ){
                    Icon(
                        painter = image
                        ,contentDescription = description)
                }
            }
        )


        TextButton(
            colors = ButtonColors(
                containerColor =
                Color.White,
                contentColor = RouteBlue,
                RouteBlue,
                RouteBlue
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .offset(y = 20.dp)
                .border(width = 7.dp, shape = RoundedCornerShape(15.dp), color = Color.White),
            onClick = {}) {
            Text(
                text = stringResource(R.string.sign_up),
                fontFamily = fontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen()
}