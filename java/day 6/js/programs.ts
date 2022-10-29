type tsa = TemplateStringsArray

class programs {
	// Q-1 Word sort
	static wordSort(input: tsa) {
		const sortedWords = input[0].split(' ').sort()
		console.log('Sorted words ->')
		return sortedWords.map((sortedWord) => console.log(sortedWord))
	}
	// Q-2 word count
	static wordCount(input: tsa) {
		console.log('The length is ' + input[0].replace(' ', '').length)
	}
	// Q-3 Check for digit or chars in a string
	static checkCharAndDigit(input: tsa) {}
}

// programs.wordSort`Hwew wewe`
// programs.wordCount`jhsj`

function checkNum(input: string) {
	try {
		if (input.split(/\d+/gi) && input.split(/\D+/gi)) {
			return 2
		}
		input.match(/[\d]/gi)!.forEach((index) => {
			console.log(index)

			// if (index.match(/\d/gi)) console.log(1)
			return 0
		})
	} catch {
		return 1
	}
	return
}

// checkNum('Hello bhai to')
// checkNum('123 456')
if (!checkNum('Hello bhai too')) console.log('only char')
else if (checkNum('12 3847') == 1) console.log('only num')
if (checkNum('Hell0 bhai 2') == 2) console.log('Both num and char')

console.log('Hello a test if A if present afterall'.match(/a/gi))
