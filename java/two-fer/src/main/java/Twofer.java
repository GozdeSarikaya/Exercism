class Twofer {
    String twofer(String name) {
        return name == null? "One for you, one for me.": "One for " + name + ", one for me.";
        //return String.format("One for %s, one for me.", Optional.ofNullable(name).orElse("you"));
    }
}
