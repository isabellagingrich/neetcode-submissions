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

        for (int i = 0; i < distinctSorted.size(); i++) { 
            ArrayList<String> innerList = new ArrayList<String>(); 
            for (String s : strs) { 
                if (sortedMap.get(s).equals(distinctSorted.get(i))) { 
                    innerList.add(s); 
                }
            }
            list.add(innerList);
        }

        return list;
    }

    public String sortString(String s) { 
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    

}
