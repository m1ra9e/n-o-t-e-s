#!/bin/bash

SCRIPT_DIR=$(dirname "$(readlink -f "$0")")

JAVA_BIN="$SCRIPT_DIR/jre/bin/java"

if [ ! -x "$JAVA_BIN" ]; then
    chmod +x "$JAVA_BIN"
fi

"$JAVA_BIN" -jar "$SCRIPT_DIR/app.jar" "$@"
