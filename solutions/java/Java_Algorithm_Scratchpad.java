int n = sc.nextInt();
Map<Integer, Integer> freq = new HashMap<>();
for (int i = 0; i < n; i++) {
    int val = sc.nextInt();
    freq.put(val, freq.getOrDefault(val, 0) + 1);
}

for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    System.out.println("Element: " + entry.getKey() + " -> Count: " + entry.getValue());
}