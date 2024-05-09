/*
 * Copyright (c) 2023-2024 Gitar, Inc.
 */
 package main

 import (
    "flagfn"
    "fmt"
 )

var (
    // EXPECTED: we should simplify this to true.
    flag_key_123abc = flagfn.NewBool(`FLAG_KEY_123ABC`, false, logDogfoodErrors)
)


func check_if_variant_23() {
    if flag_key_123abc {
        fmt.Println("Enabled pattern flag_key_123abc")
    } else {
        fmt.Println("Disabled pattern flag_key_123abc")
    }
}