/*
 * Copyright (c) 2023-2024 Gitar, Inc.
 */
 package main

 import (
    "flagfn"
    "fmt"
 )

 func check_if_variant() {
    if flag_key_123abc {
        fmt.Println("Enabled pattern flag_key_123abc")
    } else {
        fmt.Println("Disabled pattern flag_key_123abc")
    }
}