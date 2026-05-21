class Solution {
    public boolean isAnagram(String s, String t) {
        // thought process - 
        // create two hashmaps of characters and occurences for each string. 
        HashMap<Character, Integer> dictionary1 = getDictionary(s);
        HashMap<Character, Integer> dictionary2 = getDictionary(t);  

        return compareDictionaries(dictionary1, dictionary2); 
    }

    public boolean compareDictionaries(HashMap h1, HashMap h2) { 
        if (h1.size() != h2.size()) { 
            return false; 
        }
        
        Set<Character> characters = h1.keySet(); 
        for(Character c : characters) { 
            if (h1.get(c) != null) { 
                if (!(h1.get(c)).equals(h2.get(c))) { 
                    return false; 
                } 
            }
        }


        return true;
    }

    public HashMap<Character, Integer> getDictionary(String s) { 
        HashMap<Character, Integer> dictionary = new HashMap<>(); 

        for (Character c : s.toCharArray()) { 
            if(dictionary.get(c) == null) { 
                dictionary.put(c, 1); 
            } else { 
                dictionary.put(c, dictionary.get(c) + 1);
            }
        }

        return dictionary;
    }

    public void printDictionary(HashMap h) { 
        System.out.println(h); 
    }
}


