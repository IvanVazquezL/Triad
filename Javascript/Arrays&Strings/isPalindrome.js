function isPalindrome(s) {
    let processedString = "";

    for (let i = 0; i < s.length; i++) {
        if (isAlphanumeric(s[i])) {
            processedString += s[i].toLowerCase();
        }
    }

    let left = 0;
    let right = processedString.length - 1;

    while (left < right) {
        if (processedString[left] !== processedString[right]) {
            return false;
        }
        left++;
        right--;
    }

    return true;

    function isAlphanumeric(char) {
        return /^[a-z0-9]+$/i.test(char);
    }
}



console.log(isPalindrome("abcdcba"));
console.log(isPalindrome("racecar"));
console.log(isPalindrome("A man, a plan, a canal: Panama"));
console.log(isPalindrome("race a car"));
console.log(isPalindrome(" "));