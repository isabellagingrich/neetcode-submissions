class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, String> sortedMap = new HashMap<>(); // map all we see -- [string, sortedString]
        ArrayList<String> distinctSorted = new ArrayList<>(); // store distinct sortedString

        for (String s : strs) { 
            String sorted = sortString(s);
            sortedMap.put(s, sorted);
            if (!distinctSorted.contains(sorted)) { 
                distinctSorted.add(sorted);
            }
        }
        
        ArrayList<List<String>> list = new ArrayList<>(); 
        Set<String> keyset = sortedMap.keySet(); 

        // System.out.println("+" +distinctSorted); 
        // System.out.println("-" +keyset); 

        for (int i = 0; i < distinctSorted.size(); i++) { 
            ArrayList<String> innerList = new ArrayList<String>(); 
            for (String s : strs) { 
                // System.out.println(s + " - " + sortedMap.get(s) + " + " + distinctSorted.get(i)); 
                if (sortedMap.get(s).equals(distinctSorted.get(i))) { 
                    // System.out.println("adding");
                    innerList.add(s); 
                }
            }
            list.add(innerList);
            // System.out.println(innerList); 
        }

        System.out.println(list); 
        return list;
    }

    public String sortString(String s) { 
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    

}
