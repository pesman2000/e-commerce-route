package com.route.ecommerce.accountdetailsscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.route.ecommerce.R
import com.route.ecommerce.navigationbottombar.NavigationModel
import com.route.ecommerce.ui.theme.RouteBlueEmail
import com.route.ecommerce.ui.theme.RouteBlueText
import com.route.ecommerce.ui.theme.TextFieldBorderColor
import com.route.ecommerce.ui.theme.fontFamily

@Composable
fun AccountDetailsScreen(/*navController: NavController*/) {
    NavigationModel()

    var userFullName by remember { mutableStateOf("") }

    var email by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }

    var mobileNumber by remember { mutableStateOf("") }

    var address by remember { mutableStateOf("") }



    Column(modifier = Modifier
        .padding(horizontal = 10.dp, vertical = 30.dp)
        .fillMaxHeight()) {

        Image(
            painter = painterResource(id = R.drawable.routesignature),
            contentDescription = "",
            colorFilter = ColorFilter.tint(RouteBlueText),
            contentScale = ContentScale.Fit,

            )

        Text(
            text = "Welcome, User",
            color = RouteBlueText,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 20.dp)
        )
        Text(
            text = "User@email.com",
            color = RouteBlueEmail,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 5.dp)
        )

        Text(
            text = stringResource(R.string.your_full_name),
            color = RouteBlueText,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, bottom = 10.dp)
        )
        TextField(
            value = userFullName,
            onValueChange = { userFullName = it },
            singleLine = true,
            placeholder = { Text(stringResource(R.string.user_full_name)) },
            shape = RoundedCornerShape(15.dp),
            textStyle = TextStyle(fontFamily = fontFamily),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.edit_pen),
                        contentDescription = stringResource(R.string.edit_pen_icon)
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(1.dp, TextFieldBorderColor, RoundedCornerShape(15.dp))
        )

        Text(
            text = stringResource(R.string.your_e_mail),
            color = RouteBlueText,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            placeholder = { Text(stringResource(R.string.user_email)) },
            shape = RoundedCornerShape(15.dp),
            textStyle = TextStyle(fontFamily = fontFamily),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.edit_pen),
                        contentDescription = stringResource(R.string.edit_pen_icon)
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(1.dp, TextFieldBorderColor, RoundedCornerShape(15.dp))
        )

        Text(
            text = "Your Password",
            color = RouteBlueText,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(stringResource(R.string.user_password)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(15.dp),
            textStyle = TextStyle(fontFamily = fontFamily),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.edit_pen),
                        contentDescription = stringResource(R.string.edit_pen_icon)
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(1.dp, TextFieldBorderColor, RoundedCornerShape(15.dp))
        )

        Text(
            text = stringResource(R.string.your_mobile_number),
            color = RouteBlueText,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        TextField(
            value = mobileNumber,
            onValueChange = { mobileNumber = it },
            placeholder = { Text(stringResource(R.string.user_mobile_number)) },
            shape = RoundedCornerShape(15.dp),
            textStyle = TextStyle(fontFamily = fontFamily),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.edit_pen),
                        contentDescription = stringResource(R.string.edit_pen_icon)
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(1.dp, TextFieldBorderColor, RoundedCornerShape(15.dp))
        )

        Text(
            text = stringResource(R.string.your_address),
            color = RouteBlueText,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        TextField(
            value = address,
            onValueChange = { address = it },
            placeholder = { Text(stringResource(R.string.user_address)) },
            shape = RoundedCornerShape(15.dp),
            textStyle = TextStyle(fontFamily = fontFamily),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.edit_pen),
                        contentDescription = stringResource(R.string.edit_pen_icon)
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(1.dp, TextFieldBorderColor, RoundedCornerShape(15.dp)),

        )

    }
}


@Preview(showBackground = true)
@Composable
private fun AccountDetailsScreenPreview() {
    AccountDetailsScreen()
}

