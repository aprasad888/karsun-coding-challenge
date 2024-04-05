package org.karsun;
public class DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060 {

    public static final org.drools.model.DomainClassMetadata org_karsun_Item_Metadata_INSTANCE = new org_karsun_Item_Metadata();
    private static class org_karsun_Item_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.karsun.Item.class;
        }

        @Override
        public int getPropertiesSize() {
            return 3;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "name": return 1;
                case "quantity": return 2;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.karsun.Item");
        }
    }
    public static final org.drools.model.DomainClassMetadata java_lang_Integer_Metadata_INSTANCE = new java_lang_Integer_Metadata();
    private static class java_lang_Integer_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.lang.Integer.class;
        }

        @Override
        public int getPropertiesSize() {
            return 8;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "byteValue": return 1;
                case "describeConstable": return 2;
                case "doubleValue": return 3;
                case "floatValue": return 4;
                case "intValue": return 5;
                case "longValue": return 6;
                case "shortValue": return 7;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class java.lang.Integer");
        }
    }
    public static final org.drools.model.DomainClassMetadata java_lang_String_Metadata_INSTANCE = new java_lang_String_Metadata();
    private static class java_lang_String_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.lang.String.class;
        }

        @Override
        public int getPropertiesSize() {
            return 19;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "blank": return 1;
                case "bytes": return 2;
                case "empty": return 3;
                case "chars": return 4;
                case "codePoints": return 5;
                case "describeConstable": return 6;
                case "intern": return 7;
                case "length": return 8;
                case "lines": return 9;
                case "strip": return 10;
                case "stripIndent": return 11;
                case "stripLeading": return 12;
                case "stripTrailing": return 13;
                case "toCharArray": return 14;
                case "toLowerCase": return 15;
                case "toUpperCase": return 16;
                case "translateEscapes": return 17;
                case "trim": return 18;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class java.lang.String");
        }
    }
    public static final org.drools.model.DomainClassMetadata org_drools_ruleunits_api_DataStore_Metadata_INSTANCE = new org_drools_ruleunits_api_DataStore_Metadata();
    private static class org_drools_ruleunits_api_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.drools.ruleunits.api.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.drools.ruleunits.api.DataStore");
        }
    }
    public static final org.drools.model.DomainClassMetadata org_karsun_Order_Metadata_INSTANCE = new org_karsun_Order_Metadata();
    private static class org_karsun_Order_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.karsun.Order.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "customer": return 1;
                case "item": return 2;
                case "total": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.karsun.Order");
        }
    }
}