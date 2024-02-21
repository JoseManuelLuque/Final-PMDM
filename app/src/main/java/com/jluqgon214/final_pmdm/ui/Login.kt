package com.jluqgon214.final_pmdm.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.jluqgon214.final_pmdm.R

/**
 * This composable was generated from the UI Package 'login_page'.
 * Generated code; do not edit directly
 */
@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        INICIARSESIN()
        Logo()
        Email {
            EmailSynth {
                TextField(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    StateLayer(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        Content(modifier = Modifier.rowWeight(1.0f)) {
                            LabelText {
                                LabelText1()
                            }
                            InputText {
                                InputText1()
                            }
                        }
                        TrailingIcon {
                            Container {
                                StateLayer1 {
                                    Icon {
                                        Icon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    }
                                }
                            }
                        }
                    }
                }
                ActiveIndicator(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f)
                )
            }
        }
        ContraseA {
            ContraseASynth {
                TextField1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    StateLayer2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        Content1(modifier = Modifier.rowWeight(1.0f)) {
                            LabelText2 {
                                LabelText3()
                            }
                            InputText2 {
                                InputText3()
                            }
                        }
                        TrailingIcon1 {
                            Container1 {
                                StateLayer3 {
                                    Icon1 {
                                        Icon1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        InicioSesionAutomatico {
            Checkboxes {
                StateLayer4 {
                    Container2()
                }
            }
            InicioDeSesionAutomatico()
        }
        Botones {
            BotonIniciarSesion {
                StateLayer5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    LabelText4()
                }
            }
            BotonTegistrarse {
                StateLayer6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    LabelText5()
                }
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 802)
@Composable
private fun LoginPagePreview() {
    MaterialTheme {
        RelayContainer {
            LoginPage(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun INICIARSESIN(modifier: Modifier = Modifier) {
    RelayText(
        content = "INICIAR SESIÓN",
        fontSize = 32.0.sp,
        fontFamily = righteous,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 0.625.em,
        letterSpacing = 0.10000000149011612.sp,
        maxLines = -1,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(58.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_page_logo),
        modifier = modifier.requiredWidth(265.0.dp).requiredHeight(265.0.dp)
    )
}

@Composable
fun LabelText1(modifier: Modifier = Modifier) {
    RelayText(        content = "Email",
        fontSize = 12.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3229999542236328.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun LabelText(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun InputText1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Correo Electronico",
        fontSize = 16.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.3229999542236328.em,
        textAlign = TextAlign.Left,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun InputText(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Content(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(48.0.dp)
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_page_icon),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Container(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun StateLayer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 230,
            green = 224,
            blue = 233
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ActiveIndicator(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_page_active_indicator),
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(0.0.dp)
    )
}

@Composable
fun EmailSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        radius = 6.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(56.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun Email(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 6.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun LabelText3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contraseña",
        fontSize = 12.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.3229999542236328.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun LabelText2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun InputText3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contraseña",
        fontSize = 16.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.3229999542236328.em,
        textAlign = TextAlign.Left,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun InputText2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Content1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(48.0.dp)
    )
}

@Composable
fun Icon1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_page_icon1),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Icon1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Container1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingIcon1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun StateLayer2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextField1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 230,
            green = 224,
            blue = 233
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContraseASynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        radius = 6.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(56.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun ContraseA(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 6.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Container2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_page_container),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun StateLayer4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Checkboxes(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 4.0.dp),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun InicioDeSesionAutomatico(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inicio de sesion automatico",
        fontSize = 16.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.3229999542236328.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(230.0.dp).requiredHeight(44.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun InicioSesionAutomatico(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = -14.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun LabelText4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar Sesion",
        fontSize = 16.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.3229999542236328.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun StateLayer5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 10.0.dp,
            end = 24.0.dp,
            bottom = 10.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BotonIniciarSesion(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 239,
            green = 90,
            blue = 31
        ),
        itemSpacing = 8.0,
        radius = 10.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LabelText5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
        fontSize = 16.0.sp,
        fontFamily = redHatDisplay,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.3229999542236328.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun StateLayer6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 10.0.dp,
            end = 24.0.dp,
            bottom = 10.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BotonTegistrarse(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 239,
            green = 90,
            blue = 31
        ),
        itemSpacing = 8.0,
        radius = 10.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Botones(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 15.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 0.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 24.0,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.0f to Color(
                            alpha = 255,
                            red = 255,
                            green = 107,
                            blue = 0
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 255,
                            red = 147,
                            green = 92,
                            blue = 51
                        ),
                        start = Offset(
                            0.5f,
                            0.0f
                        ),
                        end = Offset(
                            0.5f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
