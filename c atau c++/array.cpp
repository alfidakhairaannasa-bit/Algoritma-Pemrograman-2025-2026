#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    string nim;
    cout << "Masukkan NIM: ";
    cin >> nim;

    vector<int> digit;

    for (char c : nim) {
        digit.push_back(c - '0');
    }

    int total = 0;
    for (int d : digit) {
        total += d;
    }

    int maks = *max_element(digit.begin(), digit.end());
    int minm = *min_element(digit.begin(), digit.end());
    double rata = (double) total / digit.size();

    reverse(digit.begin(), digit.end());

    cout << "\nArray digit: ";
    for (int d : digit) {
        cout << d << " ";
    }

    cout << "\nTotal: " << total;
    cout << "\nMaksimum: " << maks;
    cout << "\nMinimum: " << minm;
    cout << "\nRata-rata: " << rata;

    return 0;
}