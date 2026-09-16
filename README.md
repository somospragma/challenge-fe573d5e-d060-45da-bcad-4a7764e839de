# Fortalecimiento de Habilidades en Manejo de Excepciones y Depuración

En un entorno de desarrollo backend, es crucial manejar correctamente las excepciones para asegurar la robustez del sistema y utilizar técnicas de depuración efectivas para identificar y resolver problemas rápidamente. Este reto se enfoca en fortalecer tus habilidades en ambos aspectos, aplicándolos en un sistema de gestión de préstamos en una institución financiera.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Manejo de Excepciones y Depuración Efectiva |
| **Nivel** | advanced-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Puntos Críticos

**Objetivo:** Identificar los puntos en el sistema donde las excepciones son más probables de ocurrir.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el flujo de solicitudes de préstamos en el sistema. Identifica al menos tres puntos donde las excepciones podrían ser lanzadas debido a errores de validación, problemas de conectividad con servicios externos o intentos de acceso no autorizados.

**Entregable:** Lista de puntos críticos con una breve descripción de cada uno.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las excepciones pueden ocurrir en cualquier parte del flujo donde se realicen operaciones que puedan fallar.
- Considera tanto las validaciones de entrada como las interacciones con servicios externos.

</details>

### Fase 2: Implementación de Manejo de Excepciones

**Objetivo:** Implementar un manejo adecuado de excepciones en los puntos identificados.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Para cada punto crítico identificado, implementa un manejo de excepciones que capture y maneje la excepción de manera adecuada. Asegúrate de que el sistema proporcione una respuesta significativa al usuario y logre los detalles de la excepción para propósitos de depuración.

**Entregable:** Código que implementa el manejo de excepciones en los puntos críticos identificados.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza bloques try-catch para capturar excepciones y proporcionar una respuesta adecuada.
- Considera el uso de logs para registrar detalles de las excepciones.

</details>

### Fase 3: Técnicas de Depuración

**Objetivo:** Aplicar técnicas de depuración para identificar y resolver problemas en el sistema.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Simula un escenario donde una excepción no manejada ha ocurrido en el sistema. Utiliza técnicas de depuración para identificar la causa raíz del problema y propone una solución.

**Entregable:** Descripción del problema identificado, la causa raíz y la solución propuesta.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza logs y trazas para entender el flujo del sistema y localizar el punto de fallo.
- Considera el uso de herramientas de depuración para inspeccionar el estado del sistema en tiempo real.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las excepciones y por qué es importante manejarlas en un sistema de backend?
- **paraQueSirve**: ¿Para qué sirve el manejo de excepciones en el contexto del sistema de gestión de préstamos?
- **comoSeUsa**: ¿Cómo se implementa el manejo de excepciones en los puntos críticos del sistema?
- **erroresComunes**: ¿Cuáles son algunos errores comunes al manejar excepciones y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones debes tomar al depurar un problema en el sistema y cómo afectan esas decisiones al manejo de excepciones?

## Criterios de Evaluacion

- Identificación correcta de puntos críticos en el sistema.
- Implementación adecuada de manejo de excepciones en los puntos identificados.
- Uso efectivo de técnicas de depuración para identificar y resolver problemas.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
