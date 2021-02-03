Rel {
    *new {|path=""|
        ^PathName(thisProcess.nowExecutingPath.dirname +/+ path).fullPath;
    }
}