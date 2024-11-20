package main

import "fmt"

func GetName() string {
	// vars: float, bool, int, uint, etc.  Numerical variables can be given specific bit amounts (int8)
	name := "" // var name string

	fmt.Println("Welcome to Tim's Casino...")
	fmt.Printf("Enter your name: ")
	_, err := fmt.Scanln(&name) // scans user input and stores to name variable
	if err != nil {
		return ""
	}
	fmt.Printf("Welcome %s, Let's play!\n", name)
	return name
}

// takes and returns an unsigned integer
func GetBet(balance uint) uint {
	var bet uint
	for true {
		fmt.Printf("Enter your bet, or 0 to quit ( balance = $%d): ", balance)
		fmt.Scan(&bet)

		// else-statement must be placed as shown
		if bet > balance {
			fmt.Println("Bet cannot be larger than balance.")
		} else {
			break
		}
	}

	return bet
}
