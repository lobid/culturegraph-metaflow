#!/bin/bash

dir=`dirname $0`

if uname | grep -iq cygwin; then
    java -jar `cygpath -am $dir/metaflow-0.0.9-SNAPSHOT.jar` $*
else
    java -jar $dir/metaflow-0.0.9-SNAPSHOT.jar $*
fi


