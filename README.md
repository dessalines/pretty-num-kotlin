# Pretty-num-kotlin

Converts java / kotlin numbers to human-readable strings.

## Examples

| Num           | Output  |
| ------------- | ------- |
| 1_001         | "1k"    |
| 469_070       | "469k"  |
| 945_661       | "946k"  |
| -223_090      | "-223k" |
| -671_522      | "-672k" |
| 3_001_500     | "3M"    |
| 75_032_115    | "75M"   |
| 2_004_254_578 | "2B"    |

## Usage

Add this to your `build.gradle.kts`:

`implementation("com.github.dessalines:pretty-num-kotlin:TAG")`

Then do:

```kotlin
val numStr = prettyFormat(6727) // 6.7k

```

This is a kotlin port of [SleeplessOne1917/pretty-num](https://github.com/SleeplessOne1917/pretty-num) for Rust.
